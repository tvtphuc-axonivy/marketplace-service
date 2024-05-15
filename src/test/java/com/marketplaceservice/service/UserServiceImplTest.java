package com.marketplaceservice.service;

import com.marketplaceservice.entity.User;
import com.marketplaceservice.repository.UserRepository;
import com.marketplaceservice.service.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl employeeService;

    @Mock
    private UserRepository userRepository;

    @Test
    public void testFindAllUser() {
        // Mock data and service
        User mockUser = new User();
        mockUser.setId("123");
        mockUser.setUsername("tvtTest");
        mockUser.setPassword("12345");
        List<User> mockResultReturn = List.of(mockUser);
        Mockito.when(userRepository.findAll()).thenReturn(mockResultReturn);

        //exercise
        List<User> result = employeeService.getAllUser();

        //Verify
        Assert.assertEquals(result, mockResultReturn);
    }
}
