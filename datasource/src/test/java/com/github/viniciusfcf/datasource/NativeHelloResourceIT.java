package com.github.viniciusfcf.datasource;

import com.github.viniciusfcf.datasource.HelloResourceTest;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeHelloResourceIT extends HelloResourceTest {

    // Execute the same tests but in native mode.
}