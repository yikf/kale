/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.kale.common

object KaleConf {

  import org.apache.spark.sql.internal.SQLConf.buildStaticConf

  val KALE_REPARTITION_SMALL_FILES_ENABLE = buildStaticConf("spark.kale.limit.enable")
    .doc("Indicate to whether kale extension enable")
    .version("1.0.0")
    .booleanConf
    .createWithDefault(true)

  val KALE_REPARTITION_FILES = buildStaticConf("spark.kale.repartition.small.files")
    .doc(s"Indicate to number of files when optimize small files, valid only $KALE_REPARTITION_SMALL_FILES_ENABLE enable")
    .version("1.0.0")
    .intConf
    .createWithDefault(1)
}
