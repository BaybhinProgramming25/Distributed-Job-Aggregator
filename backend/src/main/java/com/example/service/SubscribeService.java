package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dto.User;
import com.example.repository.SubscribeRepository;
import com.example.repository.UserRepository;

import java.util.List;

@Service
public class SubscribeService {

    // List of ATS applications
    public static final List<String> DEFAULT_ATS = List.of("greenhouse", "lever", "ashby", "smartrecruiters", "recruitee","workable", "teamtailor", "workday", "remotive", "remoteok", "arbeitnow");

    private final SubscribeRepository subscribeRepository;
    private final UserRepository userRepository;

    public SubscribeService(SubscribeRepository subscribeRepository, UserRepository userRepository) {
        this.subscribeRepository = subscribeRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    public void subscribeToCompanies(String username) {

        User user = userRepository.findByUsername(username).orElseThrow(() -> new IllegalStateException("User not found: " + username));
        subscribeRepository.saveUserCompanies(user.id(), DEFAULT_ATS);
    }
}
