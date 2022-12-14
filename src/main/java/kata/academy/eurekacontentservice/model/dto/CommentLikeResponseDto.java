package kata.academy.eurekacontentservice.model.dto;

import lombok.Builder;

@Builder
public record CommentLikeResponseDto(
        Long commentId,
        Integer positiveLikesCount,
        Integer negativeLikesCount) {
}
