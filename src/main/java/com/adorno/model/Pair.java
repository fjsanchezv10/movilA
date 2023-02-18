package com.adorno.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Pair<V> {
    private V left;
    private V right;
    public void add(V add){
        if(this.left == null && this.right == null){
            this.left = add;
        } else if(this.left != null && this.right == null){
            this.right = add;
        }
    }
    public void delete(V delete){
        if(this.left == delete){
            this.left = null;
        } else if(this.right == delete){
            this.right = null;
        }
    }
}
