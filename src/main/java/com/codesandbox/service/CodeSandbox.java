package com.codesandbox.service;

import com.codesandbox.controller.dto.CompileRequest;
import com.codesandbox.controller.dto.CompileResponse;
import com.codesandbox.controller.dto.RunRequest;
import com.codesandbox.controller.dto.RunResponse;

/**
 * @author jzz
 * @github <a href="https://github.com/63213885">63213885</a>
 * @createtime 2026/5/4 19:00
 */

public interface CodeSandbox {

    CompileResponse compile(CompileRequest compileRequest);

    RunResponse run(RunRequest runRequest);

    void deleteFile(String sandboxId);

}
