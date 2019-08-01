package com.cafe24.shoppingmall.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe24.shoppingmall.repository.vo.ShopVo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Controller
@RequestMapping(value = "/api")
public class RestController {
	private String script_no;
	@RequestMapping("/list")
	public void getList() throws IOException{
		Request request = new Request.Builder()
				  .url("https://gioung9833.cafe24api.com/api/v2/admin/scripttags")
				  .addHeader("authorization", "Bearer PxXNroC3AJIv1siKcDpgnC")
				  .addHeader("content-type", "application/json")
				  .get()
				  .build();

				OkHttpClient client = new OkHttpClient();
				Response response = client.newCall(request).execute();
				System.out.println(response.body().string());
	}
	
	@RequestMapping("/create")
	public void createScripttag() throws IOException {
		System.out.println("create 실행");
		List<String> list = new ArrayList<>();
		list.add("product_list");
		ShopVo shopVo = new ShopVo(1,"https://js-aplenty.com/bar.js" , list);
		System.out.println(shopVo);
		
		Map<String, Object> map = new HashMap<>();
		map.put("request", shopVo);
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(map);
		System.out.println("json = "+json);
		
		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType,json);
		Request request = new Request.Builder()
		  .url("https://gioung9833.cafe24api.com/api/v2/admin/scripttags")
		  .addHeader("authorization", "Bearer ivQIrudKMV4ihs62pwahvD")
		  .addHeader("content-type", "application/json")
		  .post(body)
		  .build();

		OkHttpClient client = new OkHttpClient();
		Response response = client.newCall(request).execute();
		String res_body = response.body().string();
		
		Map<String, Object> res = gson.fromJson(res_body, HashMap.class);
		ShopVo shopVo2 = (ShopVo)(res.get("scripttag"));
		System.out.println("shopVo2 = "+ shopVo2+", "+shopVo.getClass());
		String script_no = shopVo2.getScript_no();

		System.out.println("res = " + res+", script_no = "+script_no);
		
	}
	
	@RequestMapping("/delete")
	public void deleteScript() throws IOException{
		
		Request request = new Request.Builder()
				  .url("https://gioung9833.cafe24api.com/api/v2/admin/scripttags/"+script_no)
				  .addHeader("authorization", "Bearer CseV5GfLy0CruK34vIrLsJ")
				  .addHeader("content-type", "application/json")
				  .delete()
				  .build();

				OkHttpClient client = new OkHttpClient();
				Response response = client.newCall(request).execute();
				System.out.println(response.body().string());
	}
}
