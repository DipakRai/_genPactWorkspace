package io.mulshankar13.shoppingcart;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import io.mulshankar13.model.CartOrder;

public class JsonTranslator {

	    private static Gson gson = null;

	    public JsonTranslator() {

	        GsonBuilder builder = new GsonBuilder();
	        builder.registerTypeAdapter(CartOrder.class, new CartOrderTranslator());
	        builder.setPrettyPrinting();
	        gson = builder.create();
	    }


	    private class CartOrderTranslator implements JsonDeserializer<CartOrder>, JsonSerializer<CartOrder> {
	        
	    	public CartOrder deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
	            JsonObject jobj = json.getAsJsonObject();
	            CartOrder cartOrder = new CartOrder();
	            cartOrder.setId(jobj.get("id").getAsInt());
	            	cartOrder.setTotalValue(jobj.get("price").getAsInt());
	            return cartOrder;
	        }

	       public JsonElement serialize(CartOrder src, Type typeOfSrc, JsonSerializationContext context) {
	            JsonObject jobj = new JsonObject();
	            jobj.addProperty("id", src.getId());
	            jobj.addProperty("totalValue", src.getTotalValue());
	            jobj.addProperty("customer", src.getCustomer().toString());
	            return jobj;
	       }

	    }

}
