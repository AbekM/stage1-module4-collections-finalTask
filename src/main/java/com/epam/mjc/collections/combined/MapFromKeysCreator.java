package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {

  public Map<Integer, Set<String>> createMap (Map<String, Integer> sourceMap) {
    Map<Integer, Set<String>> result = new HashMap<>();

    sourceMap.forEach((k, v) -> result.put(k.length(), new HashSet<>()));
    result.forEach((k, v) -> sourceMap.forEach((key, value) -> {
      if (key.length() == k) {
        v.add(key);
      }
    }));
    return result;
  }
}
