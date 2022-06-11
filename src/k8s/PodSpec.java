/**
 */
package k8s;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pod Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.PodSpec#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link k8s.PodSpec#getAffinity <em>Affinity</em>}</li>
 *   <li>{@link k8s.PodSpec#getContainers <em>Containers</em>}</li>
 *   <li>{@link k8s.PodSpec#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link k8s.PodSpec#getTopologySpreadConstraints <em>Topology Spread Constraints</em>}</li>
 *   <li>{@link k8s.PodSpec#getInitContainers <em>Init Containers</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getPodSpec()
 * @model
 * @generated
 */
public interface PodSpec extends Spec {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link k8s.Containers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see k8s.K8sPackage#getPodSpec_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Containers> getContainers();

	/**
	 * Returns the value of the '<em><b>Topology Spread Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link k8s.TopologySpreadConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Spread Constraints</em>' containment reference list.
	 * @see k8s.K8sPackage#getPodSpec_TopologySpreadConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TopologySpreadConstraint> getTopologySpreadConstraints();

	/**
	 * Returns the value of the '<em><b>Init Containers</b></em>' containment reference list.
	 * The list contents are of type {@link k8s.Containers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Containers</em>' containment reference list.
	 * @see k8s.K8sPackage#getPodSpec_InitContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Containers> getInitContainers();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link k8s.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see k8s.K8sPackage#getPodSpec_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart Policy</em>' attribute.
	 * @see #setRestartPolicy(String)
	 * @see k8s.K8sPackage#getPodSpec_RestartPolicy()
	 * @model
	 * @generated
	 */
	String getRestartPolicy();

	/**
	 * Sets the value of the '{@link k8s.PodSpec#getRestartPolicy <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Policy</em>' attribute.
	 * @see #getRestartPolicy()
	 * @generated
	 */
	void setRestartPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Affinity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affinity</em>' containment reference.
	 * @see #setAffinity(Affinity)
	 * @see k8s.K8sPackage#getPodSpec_Affinity()
	 * @model containment="true"
	 * @generated
	 */
	Affinity getAffinity();

	/**
	 * Sets the value of the '{@link k8s.PodSpec#getAffinity <em>Affinity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affinity</em>' containment reference.
	 * @see #getAffinity()
	 * @generated
	 */
	void setAffinity(Affinity value);

} // PodSpec
