package ru.bmstu.frame_analyzer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bmstu.frame_analyzer.dto.ResponseDto;
import ru.bmstu.frame_analyzer.service.FrameAnalyzerService;

@RestController
@RequestMapping("/analyze")
@RequiredArgsConstructor
public class FrameAnalyzerController {

    private final FrameAnalyzerService frameAnalyzerService;

    @PostMapping()
    public ResponseEntity<ResponseDto> analyze(@RequestBody String encodedFrame) {
        ResponseDto responseDto = frameAnalyzerService.analyzeFrame(encodedFrame);
        return ResponseEntity.ok(responseDto);
    }
}
