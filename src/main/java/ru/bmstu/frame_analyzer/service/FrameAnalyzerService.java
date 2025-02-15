package ru.bmstu.frame_analyzer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.bmstu.frame_analyzer.dto.ResponseDto;

import java.util.Random;

@Service
@Slf4j
public class FrameAnalyzerService {
    private final Random random = new Random();

    public ResponseDto analyzeFrame(String encodedFrame) {
        log.info(encodedFrame);
        return new ResponseDto(
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                "Result: " + random.nextInt(1000)
        );
    }
}
