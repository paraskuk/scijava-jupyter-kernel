/*
 * Copyright 2017 SciJava.
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
package org.scijava.plot.builder;

import org.scijava.plot.specification.VegaPlot;

/**
 *
 * @author hadim
 */
public class PlotBuilder {

    private final VegaPlot plot = new VegaPlot();

    public VegaPlot build() {
        // TODO: Check if plot contains all the required fields
        return plot;
    }

    public VegaPlot bld() {
        return build();
    }

    public PlotBuilder schema(String schema) {
        plot.setSchema(schema);
        return this;
    }

}
