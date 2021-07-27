package randall.maplestory.logger;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Method;

@Slf4j
@Aspect
@Component
public class StopwatchAOP {

    public static final String BEFORE_TEMPLATE = "准备开始 {}...";
    public static final String AFTER_TEMPLATE = "{} 完成！耗时：{}";

    @Around("@annotation(randall.maplestory.logger.StopwatchMark)")
    public Object handleLog(ProceedingJoinPoint point) throws Throwable {
        Class<?> targetClass = point.getTarget().getClass();
        Method method = ClassUtils.getMethod(targetClass, point.getSignature().getName());
        StopwatchMark mark = AnnotationUtils.findAnnotation(method, StopwatchMark.class);
        String message = mark != null ? mark.value() : point.getSignature().getName();
        log.info(BEFORE_TEMPLATE, message);
        Stopwatch started = Stopwatch.createStarted();
        Object proceed = point.proceed();
        log.info(AFTER_TEMPLATE, message, started.stop());
        return proceed;
    }
}
