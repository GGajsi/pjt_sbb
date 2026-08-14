package com.example.sbb;

// 👇 아래 import 구문들이 들어있어야 에러가 사라집니다.
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.sbb.question.Question;
import com.example.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa_02() {
        List<Question> all = this.questionRepository.findAll();
        assertEquals(16, all.size());

        Question q = all.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
    }
}