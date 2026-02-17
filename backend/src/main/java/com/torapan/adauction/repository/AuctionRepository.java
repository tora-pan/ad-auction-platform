package com.torapan.adauction.repository;

import com.torapan.adauction.domain.Auction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface AuctionRepository extends JpaRepository<Auction, UUID> {

}
