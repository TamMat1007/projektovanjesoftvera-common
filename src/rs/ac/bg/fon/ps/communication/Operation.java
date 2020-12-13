/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.communication;

import java.io.Serializable;

/**
 *
 * @author Tamara
 */
public enum Operation implements Serializable{
    LOGIN,
    GET_ALL_CITIES,
    GET_ALL_DELIVERERS,
    GET_ALL_FREE_DELIVERERS_FROM_CITY,
    ADD_DELIVERER,
    EDIT_DELIVERER,
    DELETE_DELIVERER,
    GET_ALL_RESTAURANTS,
    GET_ALL_RESTAURANTS_FROM_CITY,
    GET_ALL_PRODUCTS_FROM_RESTAURANTS,
    ADD_DELIVERY
}
