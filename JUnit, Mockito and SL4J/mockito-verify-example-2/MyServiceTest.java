package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Create service with the mock
        MyService service = new MyService(mockApi);

        // Step 3: Call the method that should trigger interaction
        service.fetchData();

        // Step 4: Verify the interaction happened
        verify(mockApi).getData();  // Passes if getData() was called once
    }
}
