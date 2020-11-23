package com.taemin.keyboardwarrior;

import java.util.Date;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.api.core.ApiFuture;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.taemin.keyboardwarrior.model.User;
import com.taemin.keyboardwarrior.service.FBInitialize;

@SpringBootTest
class KeyboardwarriorApplicationTests {

	@DisplayName("파이어베이스 유저 데이터 저장 테스트")
	@Test
	void _firebaseUserInsertTest() {
		FBInitialize fbInitialize = new FBInitialize();
		fbInitialize.initialize();
		DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
		User user = new User("code" , "taminging", new Date().getTime());
		ApiFuture<Void> a =  databaseReference.child("users").child("taemin").setValueAsync(user);
		ApiFuture<Void> b =  databaseReference.child("users").child("youngjun").setValueAsync(user);

		try {
			a.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//databaseReference.push();
	}
	
	@DisplayName("파이어베이스 유저 데이터 삭제 테스트")
	@Test
	void _firebaseUserDeleteTest() {
		FBInitialize fbInitialize = new FBInitialize();
		fbInitialize.initialize();
		DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
		try {
			databaseReference.child("users").child("youngjun").removeValueAsync().get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@DisplayName("파이어베이스 유저 데이터 조회") 
	@Test
	void _firebaseUserSelectTest() {
		FBInitialize fbInitialize = new FBInitialize();
		fbInitialize.initialize();
		DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
		//databaseReference.child("users").child("taemin").
	}

}
