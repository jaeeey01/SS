package com.example.ss.Service.Users;

import com.example.ss.Repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private UsersRepository uRepo;
}
