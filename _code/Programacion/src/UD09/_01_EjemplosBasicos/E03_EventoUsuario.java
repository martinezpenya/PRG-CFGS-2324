/*
 * Copyright (C) 2023 David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package UD09._01_EjemplosBasicos;

import javafx.event.Event;
import javafx.event.EventType;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class E03_EventoUsuario extends Event {

    public static final EventType<E03_EventoUsuario> ANY = new EventType<>(Event.ANY, "ANY");

    public static final EventType<E03_EventoUsuario> LOGIN_SUCCEEDED = new EventType<>(ANY, "LOGIN_SUCCEEDED");

    public static final EventType<E03_EventoUsuario> LOGIN_FAILED = new EventType<>(ANY, "LOGIN_FAILED");

    public E03_EventoUsuario(EventType<? extends Event> eventType) {
        super(eventType);
    }

    // cualquier otro atributo importante como la fecha, la hora...
}
