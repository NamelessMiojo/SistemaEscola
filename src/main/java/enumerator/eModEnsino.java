/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arthur
 */
public enum eModEnsino {
    FUNDAMENTAL("Fundamental"),
    FUNDAMENTAL_I("Fundamental I"),
    MEDIO("Médio");
    
    private String descricao;

    private eModEnsino(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
