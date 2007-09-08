/*
 * Copyright 2005 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.examples.manners;

import java.io.Serializable;

public final class LastSeat
    implements
    Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -3331801742327121724L;
    private final int         seat;

    public LastSeat(final int seat) {
        this.seat = seat;
    }

    public final int getSeat() {
        return this.seat;
    }

    public final String toString() {
        return "[LastSeat seat=" + this.seat + "]";
    }
}