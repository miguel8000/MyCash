package com.gameon.mycash_carteiradigital.helper;

import com.gameon.mycash_carteiradigital.model.Input;
import com.gameon.mycash_carteiradigital.model.Output;

import java.util.List;

public interface OutputDAOInterface {

    public boolean save(Output output);
    public boolean update(Output output);
    public boolean delete(Output output);
    public List<Output> list();

}
