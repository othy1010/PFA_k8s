/**
 */
package k8s.impl;

import k8s.Handler;
import k8s.K8sPackage;
import k8s.LifeCycle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getPostStart() <em>Post Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostStart()
	 * @generated
	 * @ordered
	 */
	protected Handler postStart;

	/**
	 * The cached value of the '{@link #getPreStop() <em>Pre Stop</em>}' containment reference.
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
		return postStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostStart(Handler newPostStart, NotificationChain msgs) {
		Handler oldPostStart = postStart;
		postStart = newPostStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.LIFE_CYCLE__POST_START, oldPostStart, newPostStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostStart(Handler newPostStart) {
		if (newPostStart != postStart) {
			NotificationChain msgs = null;
			if (postStart != null)
				msgs = ((InternalEObject)postStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.LIFE_CYCLE__POST_START, null, msgs);
			if (newPostStart != null)
				msgs = ((InternalEObject)newPostStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.LIFE_CYCLE__POST_START, null, msgs);
			msgs = basicSetPostStart(newPostStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.LIFE_CYCLE__POST_START, newPostStart, newPostStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handler getPreStop() {
		return preStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreStop(Handler newPreStop, NotificationChain msgs) {
		Handler oldPreStop = preStop;
		preStop = newPreStop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.LIFE_CYCLE__PRE_STOP, oldPreStop, newPreStop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreStop(Handler newPreStop) {
		if (newPreStop != preStop) {
			NotificationChain msgs = null;
			if (preStop != null)
				msgs = ((InternalEObject)preStop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.LIFE_CYCLE__PRE_STOP, null, msgs);
			if (newPreStop != null)
				msgs = ((InternalEObject)newPreStop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.LIFE_CYCLE__PRE_STOP, null, msgs);
			msgs = basicSetPreStop(newPreStop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.LIFE_CYCLE__PRE_STOP, newPreStop, newPreStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K8sPackage.LIFE_CYCLE__POST_START:
				return basicSetPostStart(null, msgs);
			case K8sPackage.LIFE_CYCLE__PRE_STOP:
				return basicSetPreStop(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getPostStart();
			case K8sPackage.LIFE_CYCLE__PRE_STOP:
				return getPreStop();
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
