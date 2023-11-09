package com.als.tog.framework.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *  Key Value 的键值对
 *
 * @author 刘嘉杰
 * @version 1.0.0
 * @date 2023/11/9 下午2:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeyValue<K,V> implements Serializable {
    private K key;
    private V value;
}
