package com.cirruslink.sparkplug.message.protobuf.chariot.types;

import java.util.List;

public class DataSet {
	
	/*
    message DataSet {
        message Value {
                enum DataType {
                        Unknown                 = 0;
                        Int1                    = 1;
                        Int2                    = 2;
                        Int4                    = 3;
                        Int8                    = 4;
                        Float4                  = 5;
                        Float8                  = 6;
                        Boolean                 = 7;
                        String                  = 8;
                        DateTime                = 9;
                        Text                    = 10;
                        Null                    = 11;
                }

                required DataType type          = 1;
                optional uint32 int_value       = 2;            // Int1, Int2, Int4
                optional uint64 long_value      = 3;            // Int8, DateTime
                optional float  float_value     = 4;            // Float4
                optional double double_value    = 5;            // Float8
                optional bool   boolean_value   = 6;            // Boolean
                optional string string_value    = 7;            // String, Text
                extensions                      8 to max;       // For third party extensions
        }

        message Row {
                repeated Value element          = 1;
                extensions                      2 to max;       // For third party extensions
        }


        required uint64 num_of_columns          = 1;
        repeated Value columns                  = 2;
        repeated Row rows                       = 3;
        extensions                              4 to max;       // For third party extensions
    }*/

	private long numOfColumns;
	private List<Value<?>> columns;
	private List<Row> rows;
	
	public DataSet() {
		super();
	}
	
	public DataSet(long numOfColumns, List<Value<?>> columns, List<Row> rows) {
		super();
		this.numOfColumns = numOfColumns;
		this.columns = columns;
		this.rows = rows;
	}

	public long getNumOfColumns() {
		return numOfColumns;
	}

	public void setNumOfColumns(long numOfColumns) {
		this.numOfColumns = numOfColumns;
	}

	public List<Value<?>> getColumns() {
		return columns;
	}

	public void setColumns(List<Value<?>> columns2) {
		this.columns = columns2;
	}

	public List<Row> getRows() {
		return rows;
	}

	public void addRow(Row row) {
		rows.add(row);
	}
	
	public void addRow(int index, Row row) {
		rows.add(index, row);
	}
	
	public Row removeRow(int index) {
		return rows.remove(index);
	}
	
	public boolean removeRow(Row row) {
		return rows.remove(row);
	}
	
	public void setRows(List<Row> rows) {
		this.rows = rows;
	}
}
