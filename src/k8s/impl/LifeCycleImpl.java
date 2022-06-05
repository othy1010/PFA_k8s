/**
 */
package k8s.impl;

import k8s.Handler;
import k8s.K8sPackage;
import k8s.LifeCycle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Cycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.LifeCycleImpl#getPostStart <em>Post Start</em>}</li>
 *   <li>{@link k8s.impl.LifeCycleImpl#getPreStop <em>Pre Stop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifeCycleImpl extends MinimalEObjectImpl.Container implements LifeCycle {
	/**
	 * The cached value of the '{@link #getPostStart() <em>Post Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostStart()
	 * @generated
	 * @ordered
	 */
	protected Handler postStart;

	/**
	 * The cached value of the '{@link #getPreStop() <em>Pre Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreStop()
	 * @generated
	 * @ordered
	 */
	protected Handler preStop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeCycleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.LIFE_CYCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handler getPostStart() {
		if (postStart != null && postStart.eIsProxy()) {
			InternalEObject oldPostStart = (InternalEObject)postStart;
			postStart = (Handler)eResolveProxy(oldPostStart);
			if (postStart != oldPostStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.LIFE_CYCLE__POST_START, oldPostStart, postStart));
			}
		}
		return postStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handler basicGetPostStart() {
		return postStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostStart(Handler newPostStart) {
		Handler oldPostStart = postStart;
		postStart = newPostStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.LIFE_CYCLE__POST_START, oldPostStart, postStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handler getPreStop() {
		if (preStop != null && preStop.eIsProxy()) {
			InternalEObject oldPreStop = (InternalEObject)preStop;
			preStop = (Handler)eResolveProxy(oldPreStop);
			if (preStop != oldPreStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.LIFE_CYCLE__PRE_STOP, oldPreStop, preStop));
			}
		}
		return preStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handler basicGetPreStop() {
		return preStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreStop(Handler newPreStop) {
		Handler oldPreStop = preStop;
		preStop = newPreStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.LIFE_CYCLE__PRE_STOP, oldPreStop, preStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.LIFE_CYCLE__POST_START:
				if (resolve) return getPostStart();
				return basicGetPostStart();
			case K8sPackage.LIFE_CYCLE__PRE_STOP:
				if (resolve) return getPreStop();
				return basicGetPreStop();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.LIFE_CYCLE__POST_START:
				setPostStart((Handler)newValue);
				return;
			case K8sPackage.LIFE_CYCLE__PRE_STOP:
				setPreStop((Handler)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case K8sPackage.LIFE_CYCLE__POST_START:
				setPostStart((Handler)null);
				return;
			case K8sPackage.LIFE_CYCLE__PRE_STOP:
				setPreStop((Handler)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case K8sPackage.LIFE_CYCLE__POST_START:
				return postStart != null;
			case K8sPackage.LIFE_CYCLE__PRE_STOP:
				return preStop != null;
		}
		return super.eIsSet(featureID);
	}

} //LifeCycleImpl
