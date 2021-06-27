package com.teste;

import org.easymock.EasyMock;
import org.junit.Test;

import java.util.List;

import static org.easymock.EasyMock.*;
import static org.mockito.Mockito.*;

public class TestCompareToMockitoEasyMock {

    //TestMOCKITO

    @Test
    public void testMockito() {
        List mock = mock(List.class);

        when(mock.get(0)).thenReturn("Um");
        when(mock.get(1)).thenReturn("Dois");

        verify(mock);
    }

    // TestEASYMOCK

    @Test
    public void testEasyMock() {
        List mockEasy = createNiceMock(List.class);

        expect(mockEasy.get(0)).andStubReturn("Um");
        expect(mockEasy.get(1)).andStubReturn("Dois");

        replay(mockEasy);

        EasyMock.verify(mockEasy);
    }

}
