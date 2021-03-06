package cn.jianwoo.eshop.manage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemProv  implements Serializable {
    private Long id;
    private  Long itemId;
    private  String key;
    private  String value;

}
