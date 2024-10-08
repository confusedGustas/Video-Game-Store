package com.gustas.videogamestore.dao;

import com.gustas.videogamestore.AbstractIntegrationTest;
import com.gustas.videogamestore.TestConfiguration;
import com.gustas.videogamestore.dao.user.UserDao;
import com.gustas.videogamestore.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static com.gustas.videogamestore.constants.TestConstants.INVALID_ID_NEGATIVE;
import static com.gustas.videogamestore.constants.TestConstants.VALID_ID;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@ContextConfiguration(classes = {TestConfiguration.class})
class UserDaoTest extends AbstractIntegrationTest {

    @Autowired
    UserDao userDao;

    @Test
    void getValidUser() {
        User user = userDao.findById(VALID_ID);

        assertNotNull(user);
        assertEquals(VALID_ID.longValue(), user.getId().longValue());
    }

    @Test
    void getInvalidUser() {
        User user = userDao.findById(INVALID_ID_NEGATIVE);

        assertNull(user);
    }
}
