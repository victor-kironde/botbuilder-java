/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a reference to a programmatic action
 */
public class SemanticAction {
    /**
     * ID of this action.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Entities associated with this action.
     */
    @JsonProperty(value = "entities")
    Map<String, Entity> entities;

    /**
     * Gets ID of this action.
     */
    public String id(){
        return this.id;
    }

    /**
     * Sets ID of this action.
     * 
     * @param id ID of this action
     * @return The SemanticAction object itself.
     */
    public SemanticAction withId(String id){
        this.id = id;
        return this;
    }

    /**
     * Gets entities associated with this action.
     *
     * @return the activities value
     */
    public Map<String, Entity> entities() {
        return this.entities;
    }

    /**
     * Sets entities associated with this action.
     * 
     * @param entities
     * @return The SemanticAction object itself.
     */
    public SemanticAction withEntities(Map<String, Entity> entities){
        this.entities = entities;
        return this;
    }
}
