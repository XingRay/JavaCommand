package com.xingray.javacommand;

import com.xingray.commandexecutor.CommandResult;
import com.xingray.commandexecutor.JavaRuntimeCommandExecutor;
import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;

public class CommandTest {

    @Test
    public void jdepsCommandTest() throws Exception {
        JDepsCommand jDepsCommand = new JDepsCommand();
        jDepsCommand.setRecursive(true);
        jDepsCommand.setTarget("./test.jar");

        JavaRuntimeCommandExecutor executor = new JavaRuntimeCommandExecutor(Charset.forName("GBK"), System.out::println);

        CommandResult result = executor.executeCommand(jDepsCommand);
        int exitValue = result.getExitValue();
        System.out.println(exitValue);
        assert exitValue == 0;
    }
}
