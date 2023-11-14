package com.bnta.the_bright_network.repositories;

import com.bnta.the_bright_network.models.Message;
import com.bnta.the_bright_network.models.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    //derived query
    List<Subscription> findByChatRoomId(Long id);
    List<Subscription> findByChatRoomIdAndUserId(Long chatRoomId, Long userId);

}
