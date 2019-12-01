package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yizhang
 * $1: Model, $2: Id type
 */
interface LuckymoneyRepository extends JpaRepository<Luckymoney, Integer> {
}
