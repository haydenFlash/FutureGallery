package com.futuregallery.service;

import com.futuregallery.model.DicValue;

import java.util.List;
import java.util.Map;

public interface DicService {
    Map<String, List<DicValue>> getAll();
}
