package sohyun.asynctaskexample;

/**
 * onPreExecute() invoked on the UI thread before the task is executed.
 * This step is normally used to setup the task,
 * for instance by showing a progress bar in the user interface.
 *
 * doInBackground(Params), invoked on the background thread immediately after onPreExecute() finishes executing.
 * This step is used to perform background computation that can take a long time.
 * The parameters of the asynchronous task are passed to this step.
 * The result of the computation must be returned by this step and will be passed back to the last step.
 * This step can also use publishProgress(Progress) to publish one or more units of progress.
 * These values are published on the UI thread, in the onProgressUpdate(Progress) step.
 *
 * onProgressUpdate(Progress), invoked on the UI thread after a call to publishProgress(Progress).
 * The timing of the execution is undefined.
 * This method is used to display any form of progress in the user interface while the background computation is still executing.
 * For instance, it can be used to animate a progress bar or show logs in a text field.
 *
 * onPostExecute(Result), invoked on the UI thread after the background computation finishes.
 * The result of the background computation is passed to this step as a parameter.
 *
 * 위는 AsyncTask의 task 수행 과정을 나타내며 위의 콜백이 호출될 때
 * 외부에서 이벤트를 처리할 수 있도록 각 콜백에 맞는 인터페이스 함수를 만든다.
 *
 */

public interface AsyncTaskEventListener<T> {
    void onPreExecute();
    void doInBackground();
    void onProgressUpdate(int progress);
    void onPostExecute(T result);
    void onCancelled();
}