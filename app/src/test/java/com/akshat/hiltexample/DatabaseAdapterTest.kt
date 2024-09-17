package com.akshat.hiltexample

import android.content.Context
import com.akshat.hiltexample.database.DatabaseAdapter
import com.akshat.hiltexample.database.DatabaseService
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import java.io.ByteArrayOutputStream
import java.io.PrintStream

@RunWith(MockitoJUnitRunner::class)
class DatabaseAdapterTest {

    @Mock
    lateinit var mockContext: Context

    @Mock
    lateinit var mockService: DatabaseService

    @Test
    fun testDatacaseAdapter(){
        val adapter = DatabaseAdapter(mockContext, mockService)

        val bo = ByteArrayOutputStream()
        System.setOut(PrintStream(bo))

        adapter.log("Unit Testing")

        bo.flush()
        val lines = String(bo.toByteArray())

        assert(lines.contains("DatabaseAdapter"))
        assert(lines.contains("Context :"))
        assert(lines.contains("unit testing"))



    }


}