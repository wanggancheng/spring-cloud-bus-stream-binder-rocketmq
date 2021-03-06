/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.demo;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Ilayaperumal Gopinathan
 */
//@EnableBinding(SampleSink.Sink.class)
public class SampleSink {

//	// Sink application definition
//	@StreamListener(Sink.SAMPLE)
//	public void receive(RemoteApplicationEvent fooMessage) {
//		System.out.println("******************");
//		System.out.println("At the Sink");
//		System.out.println("Received transformed message " + fooMessage.getSource()+ " of type " + fooMessage.getClass());
//		System.out.println("******************");
//	}
//
//	public interface Sink {
//		String SAMPLE = "sample-sink";
//
//		@Input(SAMPLE)
//		SubscribableChannel sampleSink();
//	}
}
