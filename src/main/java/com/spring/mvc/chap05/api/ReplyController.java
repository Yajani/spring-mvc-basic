package com.spring.mvc.chap05.api;

import com.spring.mvc.chap05.dto.ReplyListResponseDTO;
import com.spring.mvc.chap05.dto.page.Page;
import com.spring.mvc.chap05.service.ReplyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/replies") //공동 url매핑
@Slf4j
public class ReplyController {

    private final ReplyService replyService;

    // 댓글 목록 조회 요청
    // URL : /api/v1/replies/3/page/1
    //          3번 게시물 댓글목록 1페이지 내놔
    @GetMapping("/{boardNo}/page/{pageNo}")
    //select할거 있으면 GET, insert - post, update -put patch
    public ResponseEntity<?> list(
            @PathVariable long boardNo,
            @PathVariable int pageNo
            // /로 받기위해서 @PathVariable 붙이기
    ) {
        log.info("/api/v1/replies/{}/page/{} : GET!!", boardNo, pageNo);

        Page page = new Page();
        page.setPageNo(pageNo);
        page.setAmount(10); //댓글 10개씩 띄우기 기본값은 6이다 !

        ReplyListResponseDTO replyList
                = replyService.getList(boardNo, page);

        return ok().body(replyList);
    }
}