package com.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ItemPK implements Serializable {
    private int itemId;
    private int userId;

    @Column(name = "itemId")
    @Id
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Column(name = "userId")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemPK itemPK = (ItemPK) o;

        if (itemId != itemPK.itemId) return false;
        if (userId != itemPK.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = itemId;
        result = 31 * result + userId;
        return result;
    }
}
