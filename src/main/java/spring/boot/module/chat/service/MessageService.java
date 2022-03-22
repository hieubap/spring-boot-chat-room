package spring.boot.module.chat.service;

import spring.boot.core.service.BaseService;
import spring.boot.module.chat.dto.MessageDTO;
import spring.boot.module.chat.entity.MessageEntity;

import java.util.List;

public interface MessageService extends BaseService<MessageDTO> {
    List<MessageDTO> findByUserIdAndRoomId(Long userId,Long roomId);
    MessageDTO mapToDTO(MessageEntity entity);
}
