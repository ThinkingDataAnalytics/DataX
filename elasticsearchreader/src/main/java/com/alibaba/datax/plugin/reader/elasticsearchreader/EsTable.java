package com.alibaba.datax.plugin.reader.elasticsearchreader;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.datax.plugin.reader.elasticsearchreader.EsField;


@Getter
@Setter
public class EsTable {
    private String name;
    private String nameCase;
    private String filter;
    private String deleteFilterKey;
    private List<EsField> column = new ArrayList<>();
}
