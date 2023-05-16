/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.druid.compressedbigdecimal;

public class CompressedBigDecimalSumAggregatorTimeseriesTest extends CompressedBigDecimalAggregatorTimeseriesTestBase
{
  @Override
  public void testIngestAndTimeseriesQuery() throws Exception
  {
    testIngestAndTimeseriesQueryHelper(
        "bd_sum_test_aggregators.json",
        "bd_sum_test_timeseries_query.json",
        "15000000010.000000005"
    );
  }

  @Override
  public void testIngestMultipleSegmentsAndTimeseriesQuery() throws Exception
  {
    testIngestMultipleSegmentsAndTimeseriesQueryHelper(
        "bd_sum_test_aggregators.json",
        "bd_sum_test_timeseries_query.json",
        "15000000010.000000005"
    );
  }
}

