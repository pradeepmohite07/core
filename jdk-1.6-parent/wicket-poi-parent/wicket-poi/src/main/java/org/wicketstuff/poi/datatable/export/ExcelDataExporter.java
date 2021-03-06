/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wicketstuff.poi.datatable.export;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.wicket.extensions.markup.html.repeater.data.table.export.IDataExporter;
import org.apache.wicket.model.ResourceModel;

/**
 * An {@link IDataExporter} which exports data in the Microsoft Excel 97/2000/XP/2003 format (xls).
 *
 * @author Jesse Long
 */
public class ExcelDataExporter
	extends AbstractExcelDataExporter
{

	/**
	 * Creates a new instance. This sets the default format name, MIME type and file name extensions. These can be changed by
	 * calling the relevant setters.
	 *
	 * @see #setContentType(java.lang.String)
	 * @see #setDataFormatNameModel(org.apache.wicket.model.IModel)
	 * @see #setFileNameExtension(java.lang.String)
	 */
	public ExcelDataExporter()
	{
		super(new ResourceModel("org.wicketstuff.poi.datatable.export.xls-format-name"), "application/vnd.ms-excel", "xls");
	}

	/**
	 * Returns a new {@link HSSFWorkbook}.
	 *
	 * @return A new {@link HSSFWorkbook}.
	 */
	@Override
	protected Workbook createWorkbook()
	{
		return new HSSFWorkbook();
	}
}
