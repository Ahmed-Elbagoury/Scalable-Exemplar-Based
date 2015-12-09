/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.giraph.master;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.giraph.aggregators.VarianceAggregatorUnoptimized;
import org.apache.giraph.aggregators.VarianceAggregatorOptimized;
import org.apache.giraph.aggregators.VarianceAggregatorOptimizedAccumlate;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
/**
 * A dumb implementation of {@link MasterCompute}. This is the default
 * implementation when no MasterCompute is defined by the user. It does
 * nothing.
 */

public class DefaultMasterCompute extends MasterCompute {

  @Override
  public void readFields(DataInput in) throws IOException {
  }

  @Override
  public void write(DataOutput out) throws IOException {
  }

  @Override
  public void compute() { }

  @Override
  public void initialize() throws InstantiationException,
      IllegalAccessException {
	 //registerAggregator(VarianceAggregatorUnoptimized.VAR_AGG, VarianceAggregatorUnoptimized.class);
	 registerAggregator(VarianceAggregatorOptimizedAccumlate.VAR_AGG, VarianceAggregatorOptimizedAccumlate.class);
  }

}
