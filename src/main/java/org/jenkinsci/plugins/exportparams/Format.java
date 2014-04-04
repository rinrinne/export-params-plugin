/*
 *  The MIT License
 *
 *  Copyright 2014 rinrinne All rights reserved.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package org.jenkinsci.plugins.exportparams;

import org.jenkinsci.plugins.exportparams.serializer.JSONSerializer;
import org.jenkinsci.plugins.exportparams.serializer.PropertiesSerializer;
import org.jenkinsci.plugins.exportparams.serializer.Serializer;
import org.jenkinsci.plugins.exportparams.serializer.XMLSerializer;
import org.jenkinsci.plugins.exportparams.serializer.YAMLSerializer;

/**
 * A enum for file format.
 *
 * @author rinrinne (rinrin.ne@gmail.com)
 */
public enum Format {
    /**
     * Java properties.
     */
    PROPERTIES("properties", "Properties", PropertiesSerializer.class),
    /**
     * XML format.
     */
    XML("xml", "XML", XMLSerializer.class),
    /**
     * JSON format.
     */
    JSON("json", "JSON", JSONSerializer.class),
    /**
     * YAML format.
     */
    YAML("yml", "YAML", YAMLSerializer.class);

    /**
     * Extention.
     */
    public final String extension;
    /**
     * Description.
     */
    public final String description;
    /**
     * class object for serializer.
     */
    public final Class<? extends Serializer> clazz;

    /**
     * Constructor.
     *
     * @param extension the extension.
     * @param description the description.
     * @param clazz the class extends {@link Serializer}.
     */
    private Format(String extension, String description, Class<? extends Serializer> clazz) {
        this.extension = extension;
        this.description = description;
        this.clazz = clazz;
    }
}
