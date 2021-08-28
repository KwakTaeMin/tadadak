package com.taemin.keyboardwarrior.user;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.taemin.keyboardwarrior.user.domain.NickName;
import com.taemin.keyboardwarrior.user.exception.NickNameException;

public class NickNameTest {

	@Test
	void 닉네임_생성_테스트() {
		NickName nickName = new NickName("nickName");
		assertThat(nickName.value()).isEqualTo("nickName");
	}

	@Test
	void 닉네임_0글자이하_생성_불가_테스트() {
		assertThatThrownBy(() -> {
				NickName nickName = new NickName("");
			}
		).isInstanceOf(NickNameException.class);
	}

	@Test
	void 닉네임_16글자초과_생성_불가_테스트() {
		assertThatThrownBy(() -> {
				NickName nickName = new NickName("12345689012345678");
			}
		).isInstanceOf(NickNameException.class);
	}
}
