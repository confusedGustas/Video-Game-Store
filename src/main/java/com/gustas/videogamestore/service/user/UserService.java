package com.gustas.videogamestore.service.user;

import com.gustas.videogamestore.dto.request.LoginUserRequestDto;
import com.gustas.videogamestore.dto.request.SaveUserRequestDto;
import com.gustas.videogamestore.dto.response.CheckUserResponseDto;
import com.gustas.videogamestore.dto.response.PaginatedResponseDto;
import com.gustas.videogamestore.dto.response.UserDetailsResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void saveUser(SaveUserRequestDto saveUserRequestDto);
    void loginUser(LoginUserRequestDto loginUserRequestDto, HttpSession session);
    void logoutUser(Authentication authentication, HttpServletRequest request, HttpServletResponse response);
    UserDetailsResponseDto getUserDetails();
    PaginatedResponseDto getUserGames(int pageOffset);
    void deleteUser(HttpServletRequest request, HttpServletResponse response);
    CheckUserResponseDto checkUser();

}