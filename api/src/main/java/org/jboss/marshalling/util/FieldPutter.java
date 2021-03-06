/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.marshalling.util;

import java.io.IOException;
import org.jboss.marshalling.Marshaller;

/**
 * Base class for a field "putter" which represents a field's data cell.
 */
public abstract class FieldPutter {

    /**
     * Construct a new instance.
     */
    protected FieldPutter() {
    }

    /**
     * Write the value of this field in its proper native format.
     *
     * @param marshaller the marshaller to which to write
     * @throws IOException if an error occurs
     */
    public abstract void write(final Marshaller marshaller) throws IOException;

    /**
     * Get the kind of field being written.
     *
     * @return the kind of field
     */
    public abstract Kind getKind();

    /**
     * Get the boolean value of this field.
     *
     * @return the boolean value of this field
     */
    public boolean getBoolean() {
        throw new IllegalArgumentException("Field is not a boolean field");
    }

    /**
     * Set the boolean value of this field.
     *
     * @param value the boolean value of this field
     */
    public void setBoolean(boolean value) {
        throw new IllegalArgumentException("Field is not a boolean field");
    }

    /**
     * Get the byte value of this field.
     *
     * @return the byte value of this field
     */
    public byte getByte() {
        throw new IllegalArgumentException("Field is not a byte field");
    }

    /**
     * Set the byte value of this field.
     *
     * @param value the byte value of this field
     */
    public void setByte(byte value) {
        throw new IllegalArgumentException("Field is not a byte field");
    }

    /**
     * Get the character value of this field.
     *
     * @return the character value of this field
     */
    public char getChar() {
        throw new IllegalArgumentException("Field is not a char field");
    }

    /**
     * Set the character value of this field.
     *
     * @param value the character value of this field
     */
    public void setChar(char value) {
        throw new IllegalArgumentException("Field is not a char field");
    }

    /**
     * Get the double value of this field.
     *
     * @return the double value of this field
     */
    public double getDouble() {
        throw new IllegalArgumentException("Field is not a double field");
    }

    /**
     * Set the double value of this field.
     *
     * @param value the double value of this field
     */
    public void setDouble(double value) {
        throw new IllegalArgumentException("Field is not a double field");
    }

    /**
     * Get the float value of this field.
     *
     * @return the float value of this field
     */
    public float getFloat() {
        throw new IllegalArgumentException("Field is not a float field");
    }

    /**
     * Set the float value of this field.
     *
     * @param value the float value of this field
     */
    public void setFloat(float value) {
        throw new IllegalArgumentException("Field is not a float field");
    }

    /**
     * Get the integer value of this field.
     *
     * @return the integer value of this field
     */
    public int getInt() {
        throw new IllegalArgumentException("Field is not an int field");
    }

    /**
     * Set the integer value of this field.
     *
     * @param value the integer value of this field
     */
    public void setInt(int value) {
        throw new IllegalArgumentException("Field is not an int field");
    }

    /**
     * Get the long value of this field.
     *
     * @return the long value of this field
     */
    public long getLong() {
        throw new IllegalArgumentException("Field is not a long field");
    }

    /**
     * Set the long value of this field.
     *
     * @param value the long value of this field
     */
    public void setLong(long value) {
        throw new IllegalArgumentException("Field is not a long field");
    }

    /**
     * Get the object value of this field.
     *
     * @return the object value of this field
     */
    public Object getObject() {
        throw new IllegalArgumentException("Field is not an Object field");
    }

    /**
     * Set the object value of this field.
     *
     * @param value the object value of this field
     */
    public void setObject(Object value) {
        throw new IllegalArgumentException("Field is not an Object field");
    }

    /**
     * Get the short value of this field.
     *
     * @return the short value of this field
     */
    public short getShort() {
        throw new IllegalArgumentException("Field is not a short field");
    }

    /**
     * Set the short value of this field.
     *
     * @param value the short value of this field
     */
    public void setShort(short value) {
        throw new IllegalArgumentException("Field is not a short field");
    }
}
