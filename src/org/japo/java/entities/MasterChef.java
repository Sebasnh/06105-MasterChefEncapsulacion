/*
 * Copyright 2020 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
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
package org.japo.java.entities;

import java.io.Serializable;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class MasterChef implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final int DEF_MIEMBROS = 3;
    public static final double DEF_PRESUPUESTO = 21;

    public static final int MIN_MIEMBROS = 2;
    public static final int MAX_MIEMBROS = 4;

    private int miembros;
    private double presupuesto;

    public MasterChef() {
        miembros = DEF_MIEMBROS;
        presupuesto = DEF_PRESUPUESTO;
    }

    public MasterChef(int miembros, double presupuesto) {
        if (miembros == 2 || miembros == 3 || miembros == 4) {
            this.miembros = miembros;
        } else {
            this.miembros = DEF_MIEMBROS;
        }
        if (presupuesto <=30) {

            this.presupuesto = presupuesto;
        } else {

            this.presupuesto = DEF_PRESUPUESTO;

        }
    }

    public int getMiembros() {
        return miembros;
    }

    public void setMiembros(int miembros) {
         if (miembros == 2 || miembros == 3 || miembros == 4) {
            this.miembros = miembros;
        } 
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
         if (presupuesto <=30) {

            this.presupuesto = presupuesto;
        }
    }

}
