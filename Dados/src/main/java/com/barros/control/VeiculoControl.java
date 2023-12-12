package com.barros.control;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.barros.model.VeiculoModel;
import com.barros.scanner.Scan;
import com.barros.view.GeralView;
import com.barros.view.VeiculoView;

public class VeiculoControl {
	public void receberVeiculo() {
		JSONArray jAr = new JSONArray();
		FileWriter escrever = null;
		JSONObject objTwo = new JSONObject();
		VeiculoModel vMod = new VeiculoModel();
		VeiculoView vView = new VeiculoView();

			vView.placa();
			vMod.setPlaca(Scan.vrauString());
			
			vView.renavam();
			vMod.setRenavam(Scan.vrauInt());
			
			vView.cidade();
			vMod.setCidade(Scan.vrauString());
			
			vView.bairro();
			vMod.setBairro(Scan.vrauString());
			
			vView.estado();
			vMod.setEstado(Scan.vrauString());
			
			objTwo.put("Nome", vMod.getPlaca());
			objTwo.put("CPF", vMod.getRenavam());
			objTwo.put("Bairro", vMod.getBairro());
			objTwo.put("cidade", vMod.getCidade());
			objTwo.put("Estado", vMod.getEstado());
			
			jAr.put(objTwo);
			
			try {
				escrever = new FileWriter("dados.json");
		GeralView gView = new GeralView();
		
		
		try (Scanner s = new Scanner(System.in)) {
			gView.cadVeic();
			int x;
			x = s.nextInt();
			if (x == 1) {
				
				vView.placa();
				vMod.setPlaca(s.next());

				vView.renavam();
				vMod.setRenavam(s.nextInt());

				vView.cidade();
				vMod.setCidade(s.next());

				vView.bairro();
				vMod.setBairro(s.next());

				vView.estado();
				vMod.setEstado(s.next());

				objTwo.put("Nome", vMod.getPlaca());
				objTwo.put("CPF", vMod.getRenavam());
				objTwo.put("Bairro", vMod.getBairro());
				objTwo.put("cidade", vMod.getCidade());
				objTwo.put("Estado", vMod.getEstado());

				jAr.put(objTwo);
				s.close();

				try {
					escrever = new FileWriter("dados.json");

					escrever.write(objTwo.toString());
					escrever.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		
	
	}
}
