/**
 * Copyright [2012] [Datasalt Systems S.L.]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datasalt.pangool.flow.io;

import com.datasalt.pangool.io.Fields;
import com.datasalt.pangool.io.Schema;

/**
 * Output spec for Tuple outputs.
 */
public class TupleOutput implements RichOutput {

	final private Schema outputSchema;

	public TupleOutput(String outputSchema) {
		this.outputSchema = new Schema("autogenerated", Fields.parse(outputSchema));	
	}
	
	public TupleOutput(Schema outputSchema) {
		this.outputSchema = outputSchema;
	}

	public Schema getOutputSchema() {
  	return outputSchema;
  }
}
